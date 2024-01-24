package org.example.app.controller;

import org.example.app.model.PostModel;
import org.example.app.utils.AppStarter;
import org.example.app.view.PostsView;

public class PostsController {
    PostModel postModel;
    PostsView view;

    public PostsController(PostModel postModel, PostsView postView) {
        this.postModel = postModel;
        this.view = postView;
    }

    public void getPosts() {
        view.getOutput(readPosts());
        AppStarter.startApp();
    }

    private String readPosts() {

        return postModel.fetchPosts().toString();
    }

}
