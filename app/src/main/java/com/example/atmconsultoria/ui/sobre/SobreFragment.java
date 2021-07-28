package com.example.atmconsultoria.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {


    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String descricao = "Somos uma consultoria de dados, business intelligence e data science" +
                " com foco em negócios e na conquista de resultados. Utilizamos as principais" +
                " ferramentas e tecnologias do mercado no desenvolvimento de projetos que ajudem" +
                " os nossos clientes a extrair o máximo de valor de seus dados e se transformar" +
                " digitalmente.";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");

        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descricao)

                .addGroup("Entre em contato")
                .addEmail("entreemcontato@atmconsultoria.com.br")
                .addWebsite("https://www.bing.com", "Visite nosso site")

                .addGroup("Redes sociais")
                .addFacebook("https://www.bing.com/", "Visite nossa página no facebook")
                .addGitHub("fhzuccoli", "Visite nossos projetos Git")

                .addItem(versao)
                .create();
        //return inflater.inflate(R.layout.fragment_sobre, container, false);
    }
}