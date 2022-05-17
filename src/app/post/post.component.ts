import { Component, OnInit } from '@angular/core';
import { Post } from 'src/models/post';
import { PostServiceService } from 'src/services/post-service/post-service.service';

@Component({
  selector: 'app-post-component',
  templateUrl: 'post.component.html',
  styleUrls: ['post.component.css']
})
export class PostComponent implements OnInit {

  constructor(private postServiceService: PostServiceService) { 
    this.postServiceService = postServiceService;
  
  }

  Post = new Post();

  ngOnInit(): void {
    
  }

  
}
