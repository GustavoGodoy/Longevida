package com.longevida.repository;

<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> 83e8185965ee2dfc942fa7bea2a391ccffdf826b
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.longevida.model.Usuario;


<<<<<<< HEAD

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
	public Optional<Usuario> findByUsuario(String usuario);
	
	
=======
	public Optional<Usuario> findByLoginUsuario(String loginUsuario);

	
	

>>>>>>> 83e8185965ee2dfc942fa7bea2a391ccffdf826b
}
