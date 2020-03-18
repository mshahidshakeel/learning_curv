package pk.smg.learningcurv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

import pk.smg.learningcurv.model.ChatHead;

public class ChatHeadAdapter extends ArrayAdapter<ChatHead> {


    public ChatHeadAdapter(@NonNull Context context, int resource, @NonNull List<ChatHead> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;

        if(v == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            v = inflater.inflate(R.layout.chat_header, null);
        }

        ChatHead ch = getItem(position);

        if(ch != null){
            ImageView profileImage = v.findViewById(R.id.profileImage);
            TextView chatTitle = v.findViewById(R.id.chatTitle);
            TextView lastChatNumber = v.findViewById(R.id.last_chat_number);

            profileImage.setImageResource(ch.getProfile_image());
            chatTitle.setText(ch.getChat_title());
            lastChatNumber.setText(ch.getLast_chat_number());
        }

        return v;
    }
}
