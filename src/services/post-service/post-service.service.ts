import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Post } from 'src/models/post';
import { PageOfItems } from 'src/models/page-of-item';
import { Comment } from 'src/models/comment';



@Injectable({
  providedIn: 'root'
})

export class PostServiceService {
  private baseURL = "http://34.72.139.183/posts"

  constructor(private http: HttpClient) { }

  fetchListOfPosts(pageNumber: number, pageSize: number):Observable<PageOfItems<Post>> {
    return this.http.get<PageOfItems<Post>>(`${this.baseURL}?pageNumber=${pageNumber}&pageSize=${pageSize}`);
  }

  fetchPagedPosts(post: Post, pageNumber: number, pageSize: number):Observable<PageOfItems<Post>> {
    return this.http.get<PageOfItems<Post>>(`${this.baseURL}/${post.id}/comments?pageNumber=${pageNumber}&pageSize=${pageSize}`);
  }

  getComments(post: Post, pageNumber: number, pageSize: number):Observable<PageOfItems<Comment>> {
    return this.http.get<PageOfItems<Comment>>(`${this.baseURL}/comments?postId=${post.id}&pageNumber=${pageNumber}&pageSize=${pageSize}`)
  }
}
