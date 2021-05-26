import axios from "axios";

var baseUrl = "http://localhost:8090/"
class AwardsService{

    getCompanyAwards(){
        return axios.get(baseUrl+'getCompanyAwards')
    }
}

export default new AwardsService();