package com.example.ejercicio6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejercicio6.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FirstFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(getLayoutInflater(), container, false);
        View view = binding.getRoot();



       // public void setData(){
           // adapter.setData(getData());

           // public void addData(){
                //data.add("word "+ String.valueOf(data.size()));
           // this.infoAdapter.notifyItemInserted(data.size());


        binding.btnNext.setOnClickListener(v -> {
            Adapter adapter =new Adapter();
            binding.recyclerView.setAdapter(adapter);

            List<String>listItem = new ArrayList<>();

                Image image01 = new Image("ZhuoChengyou","https://unsplash.com/photos/UBvtBr_FmrY/download?force=true&w=6 40");
                listItem.add(image01.toString());
                Image image02 = new Image("billow926","https://unsplash.com/photos/pNoP-qVwBFQ/download?force=true&w=640");
                listItem.add(image02.toString());
                Image image03 = new Image("Philipp Deiß","https://unsplash.com/photos/LfJx0gqqiEc/download?force=true&w=64 0");
                listItem.add(image03.toString());
                Image image04 = new Image("Huper by Joshua Earle","https://unsplash.com/photos/_p8gVNNsWw4/download?force=true& w=640");
                listItem.add(image04.toString());
                Image image05 = new Image("Melnychuk Nataliya","https://unsplash.com/photos/rnPGCe7LsQo/download?force=true &w=640");
                listItem.add(image05.toString());
                Image image06 = new Image("Teagan Maddux","https://unsplash.com/photos/k2DbTXQ0yrQ/download?force=true &w=640");
                listItem.add(image06.toString());
                Image image07 = new Image("Chen Liu","https://unsplash.com/photos/kZH8X0q4Nvo/download?force=true&w=6 40");
                listItem.add(image07.toString());
                Image image08 = new Image("John Fornander","https://unsplash.com/photos/iNqJx- VOceI/download?force=true&w=640");
                listItem.add(image08.toString());
                Image image09 = new Image("Parker Coffman","https://unsplash.com/photos/mNWrQ9O6KZw/download?force=tr ue&w=640");
                listItem.add(image09.toString());
                Image image10 = new Image("XPS","https://unsplash.com/photos/8pb7Hq539Zw/download?force=tru e&w=640");
                listItem.add(image10.toString());
                Image image11 = new Image("Daniel J. Schwarz","https://unsplash.com/photos/l8BvDmt8Ac4/download?force=true& w=640");
                listItem.add(image11.toString());
                Image image12 = new Image("Wesley Armstrong","https://unsplash.com/photos/q0wqYpyWDpc/download?force=tr ue&w=640");
                listItem.add(image12.toString());

            });

        return binding.getRoot();


    }


}




