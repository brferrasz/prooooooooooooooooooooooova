import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    private final EstudanteController service;

    public EstudanteController(EstudanteController service) {
        this.service = service;
    }


    @PostMapping
    public EstudanteController criarEstudante(@RequestBody EstudanteController estudante) {
        return service.salvar(estudante);
    }



    @GetMapping
    public List<EstudanteController> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public EstudanteController buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}

