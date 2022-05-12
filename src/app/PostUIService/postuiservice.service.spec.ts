import { TestBed } from '@angular/core/testing';

import { PostuiserviceService } from './postuiservice.service';

describe('PostuiserviceService', () => {
  let service: PostuiserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PostuiserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
