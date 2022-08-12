let updatingTodoId = null;


$(document).ready(function () {
    drawBoard();
    addInputChangeHandler();
});


function createTodo(title) {
    fetch(get_path("/todo"), {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            'id': updatingTodoId,
            "title": title
        })
    })
        .then(response => response.json())
        .then(todo => {
            if (updatingTodoId === null)
                appendTodoToBoard(todo);
            else
                updateTodoElement(todo)
        })

}


function deleteTodo(id) {
    fetch(get_path(`/todo/${id}`), {method: 'DELETE'})
        .then(response => todoItem(id).remove())
        .catch(error => console.log(error))
}


function updateTodo(id) {
    inputAreaElement().value = titleArea(id).innerText;
    updatingTodoId = id;
}

function changeStatus(id) {
    fetch(get_path(`/todo/${id}`), {method: 'PUT'})
        .then(response => response.json())
        .then(responseData => {
            todoItem(id).innerHTML = prepareTodoElement(responseData)
        })
        .catch(error => {
            console.log(error)
        })
}

