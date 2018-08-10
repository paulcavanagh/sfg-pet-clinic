package com.parc.sfgpetclinic.services.map;

import com.parc.sfgpetclinic.model.Visit;
import com.parc.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitServiceMap extends  AbstractMapService<Visit,Long> implements VisitService {


    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {

        if(visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null ||
                visit.getPet().getOwner().getPets() == null){
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
