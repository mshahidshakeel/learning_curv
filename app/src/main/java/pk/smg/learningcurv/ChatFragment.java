package pk.smg.learningcurv;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.zip.Inflater;

import pk.smg.learningcurv.model.ChatHead;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends Fragment {

    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_chat, container, false);
        ListView chatListView = v.findViewById(R.id.chatListView);

        ArrayList<ChatHead> chatHeads = new ArrayList<>();
        for(int i=0; i<15; ++i){
            chatHeads.add(new ChatHead(R.drawable.ic_photo_camera_white_24dp,
                    "Title 1", "+091234567890"));
        }

        ChatHeadAdapter chatHeadAdapter = new ChatHeadAdapter(getContext(), R.layout.chat_header, chatHeads);
        chatListView.setAdapter(chatHeadAdapter);

        return v;
    }
}
