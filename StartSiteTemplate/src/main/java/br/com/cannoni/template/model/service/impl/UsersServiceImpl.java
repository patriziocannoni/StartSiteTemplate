package br.com.cannoni.template.model.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cannoni.template.model.dao.UsersDAO;
import br.com.cannoni.template.model.dto.UserDTO;
import br.com.cannoni.template.model.entity.User;
import br.com.cannoni.template.model.service.UsersService;

/**
 * @author patrizio
 * @since 30/08/2017
 *
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {

    private static final long serialVersionUID = -6979136969103133510L;
    
    @Autowired
    private UsersDAO usersDAO;
    
    @Override
    public List<UserDTO> getUsers() {
        List<User> users = usersDAO.getUsers();
        return convertListToDTO(users);
    }

    private List<UserDTO> convertListToDTO(final List<User> users) {
        ModelMapper modelMapper = new ModelMapper();
        List<UserDTO> usersDTO = new ArrayList<>();
        users.forEach(user -> usersDTO.add(modelMapper.map(user, UserDTO.class)));
        return usersDTO;
    }

}
