package link.hiroshisprojects.springbasics.cats;

public class CatService {
    private CatDao catDao;

    public CatService(CatDao catDao) {
        this.catDao = catDao;
    }

    public void feedCats() {
        catDao.fetchCats();
        System.out.println("CatService feeding fetched cats...");
    }

}
