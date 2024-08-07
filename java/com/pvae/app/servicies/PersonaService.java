package com.pvae.app.servicies;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pvae.app.models.PersonaModel;
import com.pvae.app.repositories.PersonaRepository;

import jakarta.transaction.Transactional;

@Service
public class PersonaService {

      private final PersonaRepository personaRepository;

      public PersonaService(PersonaRepository personaRepository) {
            this.personaRepository = personaRepository;
      }

      public List<PersonaModel> listarPersonas() {
            return (List<PersonaModel>) personaRepository.findAll();
      }

      public PersonaModel buscarPersona(Long id) {
            return personaRepository.findById(id).orElse(null);
      }

      @Transactional
      public void guardarPersona(PersonaModel persona) {
            personaRepository.save(persona);
      }

      @Transactional
      public void eliminarPersona(Long idpersona) {
            personaRepository.deleteById(idpersona);
      }

}
