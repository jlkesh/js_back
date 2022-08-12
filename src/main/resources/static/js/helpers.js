const prepareTodoElement = (todo) => `<label for="${todo.id}">
                        <input  
                            type="checkbox" 
                            onclick="changeStatus(${todo.id})" 
                            ${todo.completed ? 'checked' : ''} 
                            id="${'checkbox-' + todo.id}" />
                        <p style="text-decoration: ${todo.completed ? 'line-through' : ''}" id="p-${todo.id}">${todo.title}</p>
                    </label>
                    <i onclick="deleteTodo(${todo.id})">🗑</i>
                    <i onclick="updateTodo(${todo.id})">📝</i>`


function appendTodoToBoard(todo) {
    const todoElement = newTodoItem()
    todoElement.setAttribute('class', 'task')
    todoElement.setAttribute('id', "li-" + todo.id)
    todoElement.innerHTML = prepareTodoElement(todo);
    todosBox().append(todoElement)
}

function updateTodoElement(todo) {
    todoItem(todo.id).innerHTML = prepareTodoElement(todo);
    updatingTodoId = null;
}

function drawBoard() {
    fetch("http://localhost:9090/todo")
        .then(response => response.json())
        .then(todos => todos.map(todo => appendTodoToBoard(todo)));
}


function addInputChangeHandler() {
    const inputElement = inputAreaElement();
    inputElement.addEventListener('keypress', (event) => {
        if (event.keyCode === 13) {
            createTodo(event.target.value)
            inputElement.value = '';
        }
    });
}