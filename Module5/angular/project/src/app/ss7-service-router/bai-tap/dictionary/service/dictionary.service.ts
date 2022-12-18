import {Injectable} from '@angular/core';
import {Word} from "../model/word";

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  dictionary: Word[] = [{
    word: 'depend',
    mean: 'tùy theo'
  }, {
    word: 'advantage',
    mean: 'thuận lợi'
  }, {
    word: 'consist',
    mean: 'tồn tại'
  }, {
    word: 'absorb',
    mean: 'hấp thụ'
  }];

  constructor() {
  }
  findALl() {
    return this.dictionary;
  }

  getByWord(word: string) {
    return this.dictionary.find(item =>
      item.word === word);
  }
}
