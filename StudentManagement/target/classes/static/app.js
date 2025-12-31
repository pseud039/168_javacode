const API_URL = '/subjects';
let subjects = [];

// DOM Elements
const subjectTableBody = document.getElementById('subject-table-body');
const emptyState = document.getElementById('empty-state');
const totalSubjectsEl = document.getElementById('total-subjects');
const modal = document.getElementById('subject-modal');
const subjectForm = document.getElementById('subject-form');
const modalTitle = document.getElementById('modal-title');
const subjectCodeInput = document.getElementById('subjectCode');
const subjectNameInput = document.getElementById('subjectName');
const subjectIdInput = document.getElementById('subject-id');

// Initial Load
document.addEventListener('DOMContentLoaded', fetchSubjects);

// Fetch Subjects
async function fetchSubjects() {
    try {
        const response = await fetch(API_URL);
        if (!response.ok) throw new Error('Failed to fetch subjects');
        subjects = await response.json();
        renderTable();
        updateStats();
    } catch (error) {
        showToast(error.message, 'error');
    }
}

// Render Table
function renderTable() {
    subjectTableBody.innerHTML = '';
    
    if (subjects.length === 0) {
        emptyState.classList.remove('hidden');
        return;
    }
    
    emptyState.classList.add('hidden');
    
    subjects.forEach(subject => {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>#${subject.id}</td>
            <td>${subject.subjectCode}</td>
            <td>${subject.subjectName}</td>
            <td class="action-buttons">
                <button class="icon-btn edit" onclick="editSubject(${subject.id})">
                    <i class="fa-solid fa-pen"></i>
                </button>
                <button class="icon-btn delete" onclick="deleteSubject(${subject.id})">
                    <i class="fa-solid fa-trash"></i>
                </button>
            </td>
        `;
        subjectTableBody.appendChild(row);
    });
}

// Update Stats
function updateStats() {
    totalSubjectsEl.textContent = subjects.length;
}

// Modal Functions
function openModal() {
    modal.classList.remove('hidden');
    resetForm();
    modalTitle.textContent = 'Add Subject';
}

function closeModal() {
    modal.classList.add('hidden');
    resetForm();
}

function resetForm() {
    subjectForm.reset();
    subjectIdInput.value = '';
}

// Edit Subject
function editSubject(id) {
    const subject = subjects.find(s => s.id === id);
    if (!subject) return;
    
    subjectIdInput.value = subject.id;
    subjectCodeInput.value = subject.subjectCode;
    subjectNameInput.value = subject.subjectName;
    
    modalTitle.textContent = 'Edit Subject';
    modal.classList.remove('hidden');
}

// Form Submit (Create/Update)
subjectForm.addEventListener('submit', async (e) => {
    e.preventDefault();
    
    const id = subjectIdInput.value;
    const subjectData = {
        subjectCode: subjectCodeInput.value,
        subjectName: subjectNameInput.value
    };
    
    try {
        let response;
        if (id) {
            // Update
            response = await fetch(`${API_URL}/${id}`, {
                method: 'PUT',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(subjectData)
            });
        } else {
            // Create
            response = await fetch(API_URL, {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(subjectData)
            });
        }
        
        if (!response.ok) throw new Error('Operation failed');
        
        await fetchSubjects();
        closeModal();
        showToast(id ? 'Subject updated successfully' : 'Subject added successfully', 'success');
        
    } catch (error) {
        showToast(error.message, 'error');
    }
});

// Delete Subject
async function deleteSubject(id) {
    if (!confirm('Are you sure you want to delete this subject?')) return;
    
    try {
        const response = await fetch(`${API_URL}/${id}`, { method: 'DELETE' });
        if (!response.ok) throw new Error('Failed to delete subject');
        
        await fetchSubjects();
        showToast('Subject deleted successfully', 'success');
    } catch (error) {
        showToast(error.message, 'error');
    }
}

// Toast Notification
function showToast(message, type = 'success') {
    const toast = document.createElement('div');
    toast.className = `toast ${type}`;
    toast.innerHTML = `
        <i class="fa-solid ${type === 'success' ? 'fa-check-circle' : 'fa-exclamation-circle'}"></i>
        <span>${message}</span>
    `;
    
    document.getElementById('toast-container').appendChild(toast);
    
    setTimeout(() => {
        toast.style.opacity = '0';
        setTimeout(() => toast.remove(), 300);
    }, 3000);
}

// Close modal when clicking outside
window.onclick = function(event) {
    if (event.target == modal) {
        closeModal();
    }
}
