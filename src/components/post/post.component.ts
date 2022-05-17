import { Component, OnInit } from '@angular/core';
import { Post } from '../post';
import { PostService } from '../post-service.service';

@Component({
  selector: '.app-post-component',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  constructor(private postServiceService: PostServiceService) { }

  ngOnInit(): void {

  }

}
