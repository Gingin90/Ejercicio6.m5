package com.example.ejercicio6;

import android.content.ClipData;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejercicio6.databinding.FragmentFirstBinding;
import com.example.ejercicio6.databinding.FragmentSecondBinding;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;
    List<Item> listItem= new ArrayList<>();

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
        binding.btnNext.setOnClickListener(v -> {

            private List <Item> returnItemList(){

                Item item01 = new Item("Zhuo Chengyou","https://unsplash.com/photos/UBvtBr_FmrY/download?force=true&w=6 40");
                listItem.add(item01);
                Item item02 = new Item("billow926","https://unsplash.com/photos/pNoP-qVwBFQ/download?force=true&w=640");
                listItem.add(item02);
                Item item03 = new Item("Philipp Deiß","https://unsplash.com/photos/LfJx0gqqiEc/download?force=true&w=64 0");
                listItem.add(item03);
                Item item04 = new Item("Huper by Joshua Earle","https://unsplash.com/photos/_p8gVNNsWw4/download?force=true& w=640");
                listItem.add(item04);
                Item item05 = new Item("Melnychuk Nataliya","https://unsplash.com/photos/rnPGCe7LsQo/download?force=true &w=640");
                listItem.add(item05);
                Item item06 = new Item("Teagan Maddux","https://unsplash.com/photos/k2DbTXQ0yrQ/download?force=true &w=640");
                listItem.add(item06);
                Item item07 = new Item("Chen Liu","https://unsplash.com/photos/kZH8X0q4Nvo/download?force=true&w=6 40");
                listItem.add(item07);
                Item item08 = new Item("John Fornander","https://unsplash.com/photos/iNqJx- VOceI/download?force=true&w=640");
                listItem.add(item08);
                Item item09 = new Item("Parker Coffman","https://unsplash.com/photos/mNWrQ9O6KZw/download?force=tr ue&w=640");
                listItem.add(item09);
                Item item10 = new Item("XPS","https://unsplash.com/photos/8pb7Hq539Zw/download?force=tru e&w=640");
                listItem.add(item10);
                Item item11 = new Item("Daniel J. Schwarz","https://unsplash.com/photos/l8BvDmt8Ac4/download?force=true& w=640");
                listItem.add(item11);
                Item item12 = new Item("Wesley Armstrong","https://unsplash.com/photos/q0wqYpyWDpc/download?force=tr ue&w=640");
                listItem.add(item12);
                return listItem;
            }

            Adapter adapter =new Adapter();

            binding.recyclerView.setAdapter(adapter);
        return binding.getRoot();


    }


}




