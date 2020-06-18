import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-caculator',
  templateUrl: './caculator.component.html',
  styleUrls: ['./caculator.component.css']
})
export class CaculatorComponent implements OnInit {
  num1 = 1;
  num2 = 1;
  operator = `+`;
  equal: any;
  constructor() { }

  updateNum1(num1): void{
    this.num1 = num1;
  }
  updateNum2(num2): void{
    this.num2 = num2;
  }
  updateOperator(operator): void{
    this.operator = operator;
  }
  caculation(): void{
    this.equal = null;
    switch (this.operator) {
      case '+':
      case '-':
      case '*':
        // tslint:disable-next-line:no-eval
        this.equal = eval(this.num1 + this.operator + this.num2);
        break;
      case '/':
        if (this.num2.toString() === `0`){
          this.equal = `lỗi chia cho 0`;
        }else{
          this.equal = this.num1 / this.num2;
        }
        break;
    }
  }
  ngOnInit(): void {
  }

}
