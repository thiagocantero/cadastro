package br.com.thiagocantero.cadastro.web.clients.dto;

import br.com.thiagocantero.cadastro.core.models.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor  
@AllArgsConstructor
public class ClientViewModel {
    
    private Long id;

    private String name;

    private String email;

    private String phone;

    public String getPhone(){
        return phone.replaceAll("(\\d{2})(\\d{5})(\\d{4})", "($1) $2-$3");
    }

    public static ClientViewModel of(Client client) {
        return ClientViewModel.builder()
            .id(client.getId())
            .name(client.getName())
            .email(client.getEmail())
            .phone(client.getPhone())
            .build();
        
        
    }
}
