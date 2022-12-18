import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, ParamMap} from "@angular/router";
import {DictionaryService} from "../../service/dictionary.service";
import {Word} from "../../model/word";

@Component({
  selector: 'app-translate',
  templateUrl: './translate.component.html',
  styleUrls: ['./translate.component.css']
})
export class TranslateComponent implements OnInit {

  constructor(private dictionaryService: DictionaryService, private activatedRoute: ActivatedRoute) {
  }

  result: Word;

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((param: ParamMap) => {
      const word = param.get('word');
      console.log(word)
      this.result = this.dictionaryService.getByWord(word);

    });
  }

}
