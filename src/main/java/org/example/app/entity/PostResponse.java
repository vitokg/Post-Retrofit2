package org.example.app.entity;

import java.util.List;

public class PostResponse {
    private List<Post> data;

    public PostResponse(List<Post> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "" + data;
    }
}
