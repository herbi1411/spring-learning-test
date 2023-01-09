package nextstep.helloworld.core.di;

public class StationSetterService {
    private StationRepository stationRepository;

    @Autowired
    public void setStationRepository(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public String sayHi() {
        return stationRepository.sayHi();
    }
}
