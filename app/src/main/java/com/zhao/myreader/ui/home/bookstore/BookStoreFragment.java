package com.zhao.myreader.ui.home.bookstore;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.zhao.myreader.R;
import com.zhao.myreader.databinding.FragmentBookStoreBinding;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class BookStoreFragment extends Fragment {






    private BookStorePresenter mBookStorePresenter;
    private FragmentBookStoreBinding binding;


    public BookStoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentBookStoreBinding.inflate(inflater,container,false);
        mBookStorePresenter = new BookStorePresenter(this);

        return binding.getRoot();

    }

    public RecyclerView getRvTypeList() {
        return binding.rvTypeList;
    }

    public RecyclerView getRvBookList() {
        return binding.rvBookList;
    }

    public SmartRefreshLayout getSrlBookList() {
        return binding.srlBookList;
    }

    public FragmentBookStoreBinding getBinding() {
        return binding;
    }
}
