package com.example.ejercicio6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.ejercicio6.databinding.FragmentSecondBinding;


public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "url";
    private static final String ARG_PARAM2 = "nombre";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SecondFragment() {
        // Required empty public constructor
    }


    public static SecondFragment newInstance(String param1, String param2) {
        SecondFragment fragment = new SecondFragment();
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
        binding = FragmentSecondBinding.inflate(getActivity().getLayoutInflater(), container, false);
        Glide.with(binding.getRoot()).load(mParam1).into(binding.imageView);

            Bundle bundle = new Bundle();
            bundle.putString("nombre", mParam2);
            bundle.putString("url", mParam1);
            Navigation.findNavController(binding.getRoot()).navigate(R.id.action_firstFragment_to_secondFragment, bundle);
            return binding.getRoot();

        };
    }



