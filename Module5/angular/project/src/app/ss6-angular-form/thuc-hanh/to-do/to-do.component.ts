import {Component, OnInit} from '@angular/core';
import {Todo} from "../todo";
import {FormControl, FormGroup, Validators} from '@angular/forms';

let _id = 1;

@Component({
  selector: 'app-to-do',
  templateUrl: './to-do.component.html',
  styleUrls: ['./to-do.component.css']
})
export class ToDoComponent implements OnInit {

  todos: Todo[] = [];
  content = new FormControl();

  constructor() {
  }

  ngOnInit(): void {
  }

  toggleTodo(i: number) {
    this.todos[i].complete = !this.todos[i].complete;
  }

  change() {
    const value = this.content.value;
    if (value) {
      const todo: Todo = {
        id: _id++,
        content: value,
        complete: false
      };
      this.todos.push(todo);
      this.content.reset();
    }
  }
}
