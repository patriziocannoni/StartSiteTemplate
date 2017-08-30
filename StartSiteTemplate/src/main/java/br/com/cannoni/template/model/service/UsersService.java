package br.com.cannoni.template.model.service;

import java.io.Serializable;
import java.util.List;

import br.com.cannoni.template.model.dto.UserDTO;

/**
 * @author patrizio
 * @since 30/08/2017
 *
 */
public interface UsersService extends Serializable {

    List<UserDTO> getUsers();
    
}
