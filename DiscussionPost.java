/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponder09;

public class DiscussionPost 
{

    private String date;
    private String username;
    private String topic;
    private String content;

    public DiscussionPost() 
    {
        setDate("");
        setUsername("");
        setTopic("");
        setContent("");
    }

    public DiscussionPost(String date, String username, String topic, String content) 
    {
        this.setDate(date);
        this.setUsername(username);
        this.setTopic(topic);
        this.setContent(content);
    }

    public String getTopic() 
    {
        return topic;
    }

    public void setTopic(String topic) 
    {
        this.topic = topic;
    }
    
    public String getContent() 
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public String getDate() 
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }
    
        public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public String toFileString() 
    {
    return date + "|" + username + "|" + topic + "|" + content ;
    }
    
    public void loadFromFileString(String str) 
    {
    
    // TODO: Validation should be done here

    String[] parts = str.split("|");
    date = parts[0];
    username = parts[1];
    topic = parts[2];
    content = parts[3];
    
    }
  

}
