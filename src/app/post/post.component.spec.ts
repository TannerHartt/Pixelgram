import { HttpClient, HttpHandler } from '@angular/common/http';
import { ComponentFixture, TestBed } from '@angular/core/testing';
<<<<<<< HEAD
import { HttpClientTestingModule, HttpTestingController, TestRequest } from '@angular/common/http/testing';
=======
import { PageOfItems } from 'src/models/page-of-item';
import { User } from 'src/models/user';

>>>>>>> develop
import { PostComponent } from './post.component';

describe('PostComponent', () => {
  let component: PostComponent;
  let fixture: ComponentFixture<PostComponent>;
  let httpTestingController: HttpTestingController;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PostComponent ],
<<<<<<< HEAD
      imports: [ HttpClientTestingModule ]
=======
      providers: [ HttpClient, HttpHandler ]
>>>>>>> develop
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PostComponent);
    component = fixture.componentInstance;
    component.postData = {
      post: {id: 5,
        user: new User(),
        img: "banana",
        description: "banana",
        createdOn: new Date(),
        comments: []}, 
        comments: new PageOfItems()
      };
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
