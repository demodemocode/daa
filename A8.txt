//index.erb

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Reverse Name</title>
</head>
<body>
<h1>Reverse Name</h1>
<form action="/reverse" method="POST">
<label for="first_name">First Name:</label>
<input type="text" id="first_name" name="first_name" required><br>
<label for="last_name">Last Name:</label>
<input type="text" id="last_name" name="last_name" required><br>
<button type="submit">Reverse Name</button>

</form>
</body>
</html>



//reverse.erb

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Reversed Name</title>
</head>
<body>
<h1>Reversed Name</h1>
<p><%= @reversed_name %></p>
</body>
</html>

//app.rb

require 'sinatra'

# Method to reverse the name
def reverse_name(first_name, last_name)
"#{last_name} #{first_name}"
end

get '/' do
erb :index
end

post '/reverse' do
first_name = params[:first_name]
last_name = params[:last_name]
@reversed_name = reverse_name(first_name, last_name)
erb :reverse
end
