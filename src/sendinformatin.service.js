import axios from "axios";

var baseUrl = "http://localhost:8090/"

class SendInformationService{

    postInfo(name,email,phone,compName,message){
        return axios.post(baseUrl+'postInfo',{
            username:name,
            userEmail:email,
            userPhone:phone,
            companyName:compName,
            message:message
        })
    }

}

export default new SendInformationService();