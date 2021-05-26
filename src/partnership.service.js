import axios from "axios";


const baseUrl = 'http://localhost:8090/';

class PartnershipService{

    getPartnerShips(){
        return axios.get(baseUrl+'getPartners')
    }

}

export default new PartnershipService();