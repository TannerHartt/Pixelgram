import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CommentComponent } from './comment.component';

describe('CommentComponent', () => {
  let component: CommentComponent;
  let fixture: ComponentFixture<CommentComponent>;

  let comment = {
    "id" : 1,
    "postId" : 1,
    "username" : "Ergin",
    "body" : "Excellent",
    "createdOn" : "2022/5/23"
  }

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CommentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CommentComponent);
    component = fixture.componentInstance;
    //component.comment = comment;
    fixture.detectChanges();
  });



  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
