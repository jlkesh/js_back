const todosBox = () => document.getElementById("task-container")
const todoItem = (id) => document.getElementById(`li-${id}`)
const newTodoItem = () => document.createElement("li")
const inputAreaElement = () => document.getElementById("input")
const titleArea = (id) => document.getElementById(`p-${id}`)
const server_path = "http://localhost:9090"
const get_path = (suffix) => `${server_path}${suffix}`