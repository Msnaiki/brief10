
    
    <jsp:include page="header.jsp"/>
    
    
    <div class="container" Style="display: flex; justify-content: space-around;">
        <div class="register" class="form-group">
           <form action="verification.asp" method="POST">
            <label for="username">username</label>
               <input class="form-control"  id="username" type="text" name="username">
               <label for="pass">password</label>
               <input class="form-control" id="pass" type="password" name="pass">
               <label for="cpass">confirm your password</label>
               <input class="form-control" type="password" name="cpass">
               <button class="btn btn-primary" type="submit" name="subr">submit</button>
           </form>
        </div>
        <div class="login">
            
            <form action="verificationL.asp">
                <div class="form-group">
                  <label for="username2">username</label>
                  <input type="text" class="form-control" id="username2" aria-describedby="emailHelp" placeholder="Enter email" name="username2">
                  <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Password</label>
                  <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="pass2">
                </div>
                
                
                <button type="submit" class="btn btn-primary">Submit</button>
              </form>
        </div>
        
    </div>
    
    <jsp:include page="footer.jsp"/>