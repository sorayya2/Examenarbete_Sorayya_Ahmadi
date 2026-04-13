package productcatalog.controller;

import productcatalog.entity.Product;
import productcatalog.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Product create(@RequestBody Product p) {
        return service.create(p);
    }

    @PutMapping("/{id}")
    public Product update(@RequestBody Product p, @PathVariable Long id) {
        return service.update(p, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}