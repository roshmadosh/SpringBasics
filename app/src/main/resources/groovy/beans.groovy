package groovy
import link.hiroshisprojects.springbasics.cats.*

beans {

    catDao(CatDao){}

    catService(CatService, ref('catDao'))
}