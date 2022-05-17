import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';

import { PostuiserviceService } from './postuiservice.service';

describe('PostuiserviceService', () => {
  let service: PostuiserviceService;
  let httpTestingController: HttpTestingController;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [PostuiserviceService]
    });
    httpTestingController = TestBed.inject(HttpTestingController);
    service = TestBed.inject(PostuiserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
