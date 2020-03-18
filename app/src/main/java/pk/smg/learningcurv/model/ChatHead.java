package pk.smg.learningcurv.model;

public class ChatHead {
    private int profile_image;
    private String chat_title;
    private String last_chat_number;

    public int getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(int profile_image) {
        this.profile_image = profile_image;
    }

    public String getChat_title() {
        return chat_title;
    }

    public void setChat_title(String chat_title) {
        this.chat_title = chat_title;
    }

    public String getLast_chat_number() {
        return last_chat_number;
    }

    public void setLast_chat_number(String last_chat_number) {
        this.last_chat_number = last_chat_number;
    }

    public ChatHead(int profile_image, String chat_title, String last_chat_number) {
        this.profile_image = profile_image;
        this.chat_title = chat_title;
        this.last_chat_number = last_chat_number;
    }
}
