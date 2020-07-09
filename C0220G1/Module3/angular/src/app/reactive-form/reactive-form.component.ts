import { Component, OnInit } from '@angular/core';
import {AbstractControl, FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {

  registerForm: FormGroup;
  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
    // this.registerForm = new FormGroup({
    //   fullName: new FormControl('',
    //     [Validators.required, Validators.pattern('[A-Za-z]+')]),
    //   dateOfBirth: new FormControl('', this.checkDateOfBirth)
    // });
    this.registerForm = this.fb.group({
      fullName: ['',
        [Validators.required, Validators.pattern('[A-Za-z]+')]],
      dateOfBirth: ['', this.checkDateOfBirth]
    });
  }

  getDataFromForm(): void {
    console.log(this.registerForm.value);
  }

  checkDateOfBirth(a: AbstractControl) {
    const v = a.value;
    return v > 2000 ? {invalidDate: true} : null;
  }
}
