import {Component, OnInit} from '@angular/core';
import {Word} from "../../model/word";
import {DictionaryService} from "../../service/dictionary.service";
import {ActivatedRoute, ParamMap} from "@angular/router";
import {findAll} from "@angular/compiler-cli/ngcc/src/utils";

@Component({
  selector: 'app-dictionary',
  templateUrl: './dictionary.component.html',
  styleUrls: ['./dictionary.component.css']
})
export class DictionaryComponent implements OnInit {

  dictionaryWord: Word[];


  constructor(private dictionaryService: DictionaryService) {
  }

  ngOnInit(): void {
    this.findAll();
  }

  findAll() {
    this.dictionaryWord = this.dictionaryService.findALl();
  }

}
