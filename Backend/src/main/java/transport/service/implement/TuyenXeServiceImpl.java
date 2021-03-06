package transport.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import transport.model.TuyenXe;
import transport.repository.TuyenXeRepository;
import transport.service.TuyenXeService;

import java.util.List;
import java.util.Optional;

@Service
public class TuyenXeServiceImpl implements TuyenXeService {
    private TuyenXeRepository tuyenXeRepo;

    @Autowired
    public TuyenXeServiceImpl(TuyenXeRepository tuyenXeRepo){
        this.tuyenXeRepo = tuyenXeRepo;
    }
    @Override
    public List<TuyenXe> getAllTuyenXe() {
        return (List<TuyenXe>) tuyenXeRepo.findAll();
    }

    @Override
    public void saveTuyenXe(TuyenXe tuyenXe) {
        tuyenXeRepo.save(tuyenXe);
    }

    @Override
    public void deleteTuyenXe(int id) {
        tuyenXeRepo.deleteById(id);
    }

    @Override
    public Optional<TuyenXe> getTuyenXeById(int id) {
        return tuyenXeRepo.findById(id);
    }

    @Override
    public List<TuyenXe> searchTuyenXeByKeyWord(String keyword) {
        return tuyenXeRepo.searchTuyenXeByKeyWord(keyword);
    }
}
