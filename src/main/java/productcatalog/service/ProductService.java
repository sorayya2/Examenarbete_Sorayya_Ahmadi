package productcatalog.service;

import productcatalog.entity.Product;
import productcatalog.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public Product create(Product p) {
        return repo.save(p);
    }

    public List<Product> getAll() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Product update(Product p, Long id) {
        Product existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));

        existing.setName(p.getName());
        existing.setPrice(p.getPrice());

        return repo.save(existing);
    }
}