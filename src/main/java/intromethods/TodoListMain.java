package intromethods;

import java.util.Arrays;

public class TodoListMain {
    public static void main(String[] args) {
        TodoList todoList=new TodoList();
        todoList.addTodo("Meet John");
        todoList.addTodo("Read a book");
        todoList.addTodo("Pay bills");
        todoList.addTodo("Buy eggs");
        System.out.println(todoList);

        todoList.finishTodos("Buy eggs");
        System.out.println(todoList);

        todoList.finishAllTodos(Arrays.asList("Pay bills","Meet John"));
        System.out.println(todoList);
        System.out.println(todoList.numberOfFinishedTodos());
        System.out.println(todoList.todosToFinish());

    }
}
