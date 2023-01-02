package groovy
import link.hiroshisprojects.springbasics.cats.*

beans {

    catDao(CatDao){}

    catService(CatService) {
        catDao = catDao
    }
}