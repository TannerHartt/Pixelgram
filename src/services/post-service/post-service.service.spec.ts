import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController, TestRequest } from '@angular/common/http/testing'

import { PostServiceService } from './post-service.service';
import { PageOfItems } from 'src/models/page-of-item';
import { Post } from 'src/models/post';

describe('PostServiceService', () => {
  let service: PostServiceService;
  let httpTestingController: HttpTestingController;
  beforeEach(() => {
    TestBed.configureTestingModule({
      imports:[HttpClientTestingModule]
    });
    service = TestBed.inject(PostServiceService);
    httpTestingController = TestBed.inject(HttpTestingController);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('fetchAllPost returns a page of post', () => {
    let req: TestRequest;
    let postPage: PageOfItems<Post> = {
      items: [],
      hasNext: false,
      totalElements: 0
    }

    let pageNumber = 2
    let pageSize = 2

    service.fetchListOfPosts(pageNumber,pageSize).subscribe((result) => {
      expect(result.totalElements).toBe(0)
    })

    req = httpTestingController.expectOne(`http://34.72.139.183//posts?pageNumber={2}&pageSize={2}`)
    req.flush(postPage)
  })

  it('fetchPagePost returns one post', () => {
    
  })


});
