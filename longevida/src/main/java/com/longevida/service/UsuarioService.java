package com.longevida.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.longevida.model.UserLogin;
import com.longevida.model.Usuario;
import com.longevida.repository.UsuarioRepository;

<<<<<<< HEAD


@Service
public class UsuarioService {

=======
@Service
public class UsuarioService {
>>>>>>> 83e8185965ee2dfc942fa7bea2a391ccffdf826b
	@Autowired
	private UsuarioRepository repository;
	
	public Usuario CadastrarUsuario(Usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
<<<<<<< HEAD
		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);
		
		return repository.save(usuario);	
=======
		
		String senhaEnconder = encoder.encode(usuario.getSenhaUsuario());
		usuario.setSenhaUsuario(senhaEnconder);
		
		return repository.save(usuario);
>>>>>>> 83e8185965ee2dfc942fa7bea2a391ccffdf826b
	}
	
	public Optional<UserLogin> Logar(Optional<UserLogin> user){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
<<<<<<< HEAD
		Optional<Usuario> usuario = repository.findByUsuario(user.get().getUsuario());
		
		if(usuario.isPresent()) {
			if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {
				
				String auth = user.get().getUsuario() + ":" + user.get().getSenha();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader ="Basic" + new String(encodedAuth);
				
				user.get().setToken(authHeader);
				user.get().setNome(usuario.get().getNome());
				
				return user;
				
			}
		}
		
		return null;
	}
		
}

=======
		Optional<Usuario>usuario = repository.findByLoginUsuario(user.get().getUsuario());
		
		if(usuario.isPresent()) 
		{
			if(encoder.matches(user.get().getSenha(), usuario.get().getSenhaUsuario()))  
			{
				String auth = user.get().getUsuario() + ":"+ user.get().getSenha();
				byte[] encodeAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodeAuth); 
				
				user.get().setToken(authHeader);
				user.get().setNome(usuario.get().getNomeUsuario());
				
				
				return user;
			}
		}
		return null;
	}
}
>>>>>>> 83e8185965ee2dfc942fa7bea2a391ccffdf826b
