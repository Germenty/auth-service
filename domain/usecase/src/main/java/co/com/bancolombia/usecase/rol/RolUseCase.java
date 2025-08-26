package co.com.bancolombia.usecase.rol;

import co.com.bancolombia.model.rol.Rol;
import co.com.bancolombia.model.rol.gateways.RolRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class RolUseCase {

    private final RolRepository rolRepository;

    public Flux<Rol> findAllRoles() {
        return rolRepository.findAll();
    }

}
