/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponder09;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MichaelLongCrawford
 */
public class DiscussionPostDataHandler {
    public List<DiscussionPost> getAllPosts() {
        
        List<DiscussionPost> dis = new ArrayList();
        dis.add(new DiscussionPost("Date", "Username", "Topic", "Content"));
        dis.add(new DiscussionPost("Date", "Username", "Topic", "Content"));
        return dis; 
    }
}
