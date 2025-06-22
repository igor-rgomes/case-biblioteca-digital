package com.facul.biblioteca.service;

import com.facul.biblioteca.model.Livro;
import com.facul.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> listar() {
        return livroRepository.findAll();
    }

    public Livro salvar(Livro livro) {
        return livroRepository.save(livro);
    }

    public ResponseEntity<Livro> atualizar(Long id, Livro livro) {
        return livroRepository.findById(id)
                .map(existing -> {
                    existing.setTitulo(livro.getTitulo());
                    existing.setAutor(livro.getAutor());
                    existing.setAnoPublicacao(livro.getAnoPublicacao());
                    existing.setIsbn(livro.getIsbn());
                    return ResponseEntity.ok(livroRepository.save(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Void> deletar(Long id) {
        Optional<Livro> livroOptional = livroRepository.findById(id);

        if (livroOptional.isPresent()) {
            livroRepository.delete(livroOptional.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}